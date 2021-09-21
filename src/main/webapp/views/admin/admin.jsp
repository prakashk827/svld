<!DOCTYPE html>
<html lang="en">
<head>

<!-- meta tags starts -->
<jsp:include page="includes/meta_tags.jsp" />
<!-- meta tags Ends -->

<!-- Header starts -->
<jsp:include page="includes/header.jsp" />
<!-- Header Ends -->

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

		<div class="row">
			<div class="col-md-12">
				<div class="tile">
					<div class="tile-body">
						<div class="table-responsive">
							<table class="table table-hover table-bordered" id="sampleTable">
								<thead>
									<tr>
										<th>Date</th>
										<th>Time</th>
										<th>Mobile Number</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Winner</th>
										<th>Blocked</th>
										<th>isFilled</th>
										<th>Status</th>
									</tr>
								</thead>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>

	<!-- footer Starts -->
	<jsp:include page="includes/footer.jsp" />
	<!-- footer Ends -->

	<script type="text/javascript">
		$(document).ready(function() {

			$("#sampleTable").DataTable({
				"ajax" : {
					"url" : "admin/client/registered",
					"dataSrc" : ""
				},
				"columns" : [ {
					"data" : "date"
				}, {
					"data" : "time"
				}, {
					"data" : "clientUId"
				}, {
					"data" : "firstName"
				}, {
					"data" : "lastName"
				}, {
					"data" : "winner"
				}, {
					"data" : "blocked"
				}, {
					"data" : "isFilled"
				}, {
					"data" : "status"
				}

				]
			});
		});
	</script>

</body>
</html>