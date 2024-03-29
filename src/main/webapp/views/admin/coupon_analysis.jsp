<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>

<!-- meta tags starts -->
<jsp:include page="includes/meta_tags.jsp" />
<!-- meta tags Ends -->

<!-- Header starts -->
<jsp:include page="includes/header.jsp" />
<!-- Header Ends -->
<title>${appTitle.title}</title>
</head>
<body class="app sidebar-mini">
	<!-- Navbar-->
	<header class="app-header">
		<a class="app-header__logo" href="index.html">Vali</a>

		<!-- Sidebar toggle button-->

		<a class="app-sidebar__toggle" href="#" data-toggle="sidebar"
			aria-label="Hide Sidebar"></a>

		<!-- Navbar Right Menu-->

		<ul class="app-nav">
			<!-- <li class="app-search"><input class="app-search__input"
				type="search" placeholder="Search">
				<button class="app-search__button">
					<i class="fa fa-search"></i>
				</button></li> -->

			<!--Notification Menu starts-->

			<jsp:include page="includes/notification_menu.jsp" />

			<!--Notification Menu ends-->

			<!-- User Menu starts-->

			<jsp:include page="includes/user_menu.jsp" />

			<!-- User Menu ends-->
		</ul>
	</header>
	<!-- Sidebar menu-->


	<div class="app-sidebar__overlay" data-toggle="sidebar"></div>

	<!-- Sidebar menu starts-->
	<jsp:include page="includes/side_bar_menu.jsp" />
	<!-- Sidebar menu ends-->


	<main class="app-content">
		<!-- inluclude app_title starts -->
		<jsp:include page="includes/app_title.jsp" />
		<!-- inluclude app_title ends -->


		<!-- Drop down Starts -->

		<div class="row">
			<div class="col-md-12">
				<div class="tile">
					
						<div class="col-md-3">
							<label>Select Coupon Id</label> <select class="form-control"
								id="couponId">
								<option value="">Please Select</option>

								<c:forEach items="${couponIds}" var="entry">

									<option value="${entry.id}">${entry.couponName}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-md-3">
							555
						</div>
					
				</div>
			</div>
		</div>
		

		<!-- Drop down Ends -->


		<c:if test="${couponAnalysis.code != 200}">
			<p style="text-align: center">${couponAnalysis.message}</p>
		</c:if>


		<c:if test="${couponAnalysis.code == 200}">
			<p style="text-align: left">${couponAnalysis.message}</p>
			<div class="row">
				<div class="col-md-12">
					<div class="tile">
						<div class="tile-body">
							<div class="table-responsive">

								<table class="table table-hover table-bordered" id="sampleTable">
									<thead>
										<tr>
											<th>Total Coupons</th>
											<th>ClientUId</th>
											<th>CouponId</th>
											<th>City</th>
										</tr>
									</thead>
									<tbody>

										<c:forEach items="${couponAnalysis.response}" var="map">
											<tr>
												<c:forEach items="${map}" var="entry">
													<td>${entry.value}</td>
												</c:forEach>
											</tr>
										</c:forEach>

									</tbody>
								</table>

							</div>
						</div>
					</div>
				</div>
			</div>
		</c:if>



	</main>

	<!-- footer Starts -->
	<jsp:include page="includes/footer.jsp" />
	<!-- footer Ends -->

	<script type="text/javascript">
		$('#sampleTable').DataTable();
	</script>

</body>
</html>