package com.wdu.admin.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wdu.admin.dto.RazorpayPayments;
import com.wdu.exception.GenericException;
import com.wdu.utils.Utils;

@Repository
public class RazorPayRepositoryImpl implements RazorPayRepository {
	public static int count = 0;

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public void updateRazorPayPayments(RazorpayPayments payment) throws GenericException {

		String txnId = payment.getPaymentId();

		final String SQL = "SELECT * FROM coupons_sold WHERE transactionId = ?";

		List<Map<String, Object>> list = jdbc.queryForList(SQL, new Object[] { txnId });
		// List empty means records are not updated in db
		if (list.isEmpty()) {

			if (payment.getRazorPayNotes() != null) {

				// Check mobile number is null or not
				if (payment.getRazorPayNotes().getClientUId() != null) {

					// Update only success payment
					if (payment.getCaptured()) {

						String date = Utils.getDateddMMyyyy();
						String time = Utils.getTime();

						String clientUId = payment.getRazorPayNotes().getClientUId();
						int couponId = Integer.parseInt(payment.getRazorPayNotes().getCouponId());
						int couponQty = Integer.parseInt(payment.getRazorPayNotes().getCouponQty());

						String maxLuckyNumber = getMaximumLuckyNumber(couponId);

						int luckyNumber = Integer.parseInt(maxLuckyNumber);

						for (int i = 0; i < couponQty; i++) {

							luckyNumber = luckyNumber + 1;

							String lucky = String.valueOf(luckyNumber);

							final String UPDATE_PAYMENT_STATUS = "UPDATE `coupons_sold` SET `luckyNumber`=?, `paymentStatus`=?, `transactionId`=?,`time`=?,`boughtOn`=? "
									+ "WHERE clientUId = ? AND couponId = ? AND paymentStatus =?";
						
							jdbc.update(UPDATE_PAYMENT_STATUS, lucky, "complete", txnId, time, date, clientUId,
									couponId, "pending");
						}
						
						System.out.println("Payment Status Updated for clientUId : " + clientUId + "..Date :" + new Date() );
						

					}

				}

			}
			

		}
		
		
	}

	private String getMaximumLuckyNumber(int couponId) throws GenericException {
		// Get the Maximum lucky number of the CouponId;
		final String MAX_LUCKY_NUMBER_SQL = "SELECT MAX(luckyNumber) AS maxLuckyNumber FROM coupons_sold WHERE couponId=? LIMIT 1";
		String luckyNumber = null;
		try {
			@SuppressWarnings("deprecation")
			String maxLuckyNumber = (String) jdbc.queryForObject(MAX_LUCKY_NUMBER_SQL, new Object[] { couponId },
					String.class);
			luckyNumber = maxLuckyNumber;
			// Make maxLuckyNumber = 1 if its's null
			if (luckyNumber == null) {
				luckyNumber = "0";
			}
		} catch (Exception e) {
			throw new GenericException("Error while getting maximu lucky number",
					HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
		}

		return luckyNumber;

	}

}
