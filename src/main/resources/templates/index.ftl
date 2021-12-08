<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--favicon-->
<link rel="icon" href="assets/images/favicon-32x32.png" type="image/png" />
<!--plugins-->
<link href="assets/plugins/vectormap/jquery-jvectormap-2.0.2.css"
	rel="stylesheet" />
<link href="assets/plugins/simplebar/css/simplebar.css" rel="stylesheet" />
<link href="assets/plugins/perfect-scrollbar/css/perfect-scrollbar.css"
	rel="stylesheet" />
<link href="assets/plugins/metismenu/css/metisMenu.min.css"
	rel="stylesheet" />
<!-- loader-->
<link href="assets/css/pace.min.css" rel="stylesheet" />
<script src="assets/js/pace.min.js"></script>
<!-- Bootstrap CSS -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap"
	rel="stylesheet">
<link href="assets/css/app.css" rel="stylesheet">
<link href="assets/css/icons.css" rel="stylesheet">
<!-- Theme Style CSS -->
<link rel="stylesheet" href="assets/css/dark-theme.css" />
<link rel="stylesheet" href="assets/css/semi-dark.css" />
<link rel="stylesheet" href="assets/css/header-colors.css" />
<title>首页</title>
</head>

<body>
	<!--wrapper-->
	<#include "wrapper.ftl">
	<!--navigation-->
	<#include "left.ftl">
	<!--end navigation-->
	</div>
	<!--end sidebar wrapper -->
	<!--start header -->
	<#include "head.ftl">
	<!--end header -->
	<!--start page wrapper -->
	<div class="page-wrapper">
		<div class="page-content">
			<div class="row row-cols-1 row-cols-md-2 row-cols-xl-4">
				<div class="col">
					<div
						class="card radius-10 border-start border-0 border-3 border-info">
						<div class="card-body">
							<div class="d-flex align-items-center">
								<div>
									<p class="mb-0 text-secondary">本周下单总量</p>
									<h4 class="my-1 text-info">4805</h4>
									<p class="mb-0 font-13">比上周下单量增加2.5%</p>
								</div>
								<div
									class="widgets-icons-2 rounded-circle bg-gradient-scooter text-white ms-auto">
									<i class='bx bxs-cart'></i>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div
						class="card radius-10 border-start border-0 border-3 border-danger">
						<div class="card-body">
							<div class="d-flex align-items-center">
								<div>
									<p class="mb-0 text-secondary">总进账金额</p>
									<h4 class="my-1 text-danger">￥84,245</h4>
									<p class="mb-0 font-13">比上周收入增加5.5%</p>
								</div>
								<div
									class="widgets-icons-2 rounded-circle bg-gradient-bloody text-white ms-auto">
									<i class='bx bxs-wallet'></i>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div
						class="card radius-10 border-start border-0 border-3 border-success">
						<div class="card-body">
							<div class="d-flex align-items-center">
								<div>
									<p class="mb-0 text-secondary">次品退会率</p>
									<h4 class="my-1 text-success">1.3%</h4>
									<p class="mb-0 font-13">比上周减少4.5%</p>
								</div>
								<div
									class="widgets-icons-2 rounded-circle bg-gradient-ohhappiness text-white ms-auto">
									<i class='bx bxs-bar-chart-alt-2'></i>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div
						class="card radius-10 border-start border-0 border-3 border-warning">
						<div class="card-body">
							<div class="d-flex align-items-center">
								<div>
									<p class="mb-0 text-secondary">总客户数量</p>
									<h4 class="my-1 text-warning">8.4K</h4>
									<p class="mb-0 font-13">比上周客户增加+8.4%</p>
								</div>
								<div
									class="widgets-icons-2 rounded-circle bg-gradient-blooker text-white ms-auto">
									<i class='bx bxs-group'></i>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--end row-->

			<div class="row">
				<div class="col-12 col-lg-8">
					<div class="card radius-10">
						<div class="card-body">
							<div class="d-flex align-items-center">
								<div>
									<h6 class="mb-0">收支比率</h6>
								</div>
								<div class="dropdown ms-auto">
									<a class="dropdown-toggle dropdown-toggle-nocaret" href="#"
										data-bs-toggle="dropdown"><i
										class='bx bx-dots-horizontal-rounded font-22 text-option'></i>
									</a>
									<ul class="dropdown-menu">
										<li><a class="dropdown-item" href="javascript:;">查看收入</a>
										</li>
										<li><a class="dropdown-item" href="javascript:;">查看支出</a>
										</li>
										<li>
											<hr class="dropdown-divider">
										</li>
										<li><a class="dropdown-item" href="javascript:;">收支统计</a>
										</li>
									</ul>
								</div>
							</div>
							<div class="d-flex align-items-center ms-auto font-13 gap-2 my-3">
								<span class="border px-1 rounded cursor-pointer"><i
									class="bx bxs-circle me-1" style="color: #14abef"></i>售出</span> <span
									class="border px-1 rounded cursor-pointer"><i
									class="bx bxs-circle me-1" style="color: #ffc107"></i>购入</span>
							</div>
							<div class="chart-container-1">
								<canvas id="chart1"></canvas>
							</div>
						</div>
						<div
							class="row row-cols-1 row-cols-md-3 row-cols-xl-3 g-0 row-group text-center border-top">
							<div class="col">
								<div class="p-3">
									<h5 class="mb-0">24.15M</h5>
									<small class="mb-0">售出数量 <span> <i
											class="bx bx-up-arrow-alt align-middle"></i> 2.43%
									</span></small>
								</div>
							</div>
							<div class="col">
								<div class="p-3">
									<h5 class="mb-0">12:38</h5>
									<small class="mb-0">统计时间 <span> <i
											class="bx bx-up-arrow-alt align-middle"></i> 12.65%
									</span></small>
								</div>
							</div>
							<div class="col">
								<div class="p-3">
									<h5 class="mb-0">639.82</h5>
									<small class="mb-0">购入数量 <span> <i
											class="bx bx-up-arrow-alt align-middle"></i> 5.62%
									</span></small>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 col-lg-4">
					<div class="card radius-10">
						<div class="card-body">
							<div class="d-flex align-items-center">
								<div>
									<h6 class="mb-0">货物销售比</h6>
								</div>
								<div class="dropdown ms-auto">
									<a class="dropdown-toggle dropdown-toggle-nocaret" href="#"
										data-bs-toggle="dropdown"><i
										class='bx bx-dots-horizontal-rounded font-22 text-option'></i>
									</a>
									<ul class="dropdown-menu">
										<li><a class="dropdown-item" href="javascript:;">查看收入</a>
										</li>
										<li><a class="dropdown-item" href="javascript:;">查看支出</a>
										</li>
										<li>
											<hr class="dropdown-divider">
										</li>
										<li><a class="dropdown-item" href="javascript:;">收支统计</a>
										</li>
									</ul>
								</div>
							</div>
							<div class="chart-container-2 mt-4">
								<canvas id="chart2"></canvas>
							</div>
						</div>
						<ul class="list-group list-group-flush">
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">机械键盘
								<span class="badge bg-success rounded-pill">25</span>
							</li>
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">游戏鼠标
								<span class="badge bg-danger rounded-pill">10</span>
							</li>
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">电竞144显示器
								<span class="badge bg-primary rounded-pill">65</span>
							</li>
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">30系显卡
								<span class="badge bg-warning text-dark rounded-pill">14</span>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--end row-->

			<div class="card radius-10"></div>


			<div class="row">
				<div class="col-12 col-lg-7 col-xl-8 d-flex">
					<div class="card radius-10 w-100">
						<div class="card-header bg-transparent">
							<div class="d-flex align-items-center">
								<div>
									<h6 class="mb-0">销售地区</h6>
								</div>
								<div class="dropdown ms-auto">
									<a class="dropdown-toggle dropdown-toggle-nocaret" href="#"
										data-bs-toggle="dropdown"><i
										class='bx bx-dots-horizontal-rounded font-22 text-option'></i>
									</a>
									<ul class="dropdown-menu">
										<li><a class="dropdown-item" href="javascript:;">查看收入</a>
										</li>
										<li><a class="dropdown-item" href="javascript:;">查看支出</a>
										</li>
										<li>
											<hr class="dropdown-divider">
										</li>
										<li><a class="dropdown-item" href="javascript:;">收支统计</a>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="card-body">
							<div class="row">
								<div class="col-lg-7 col-xl-8 border-end">
									<div id="geographic-map-2"></div>
								</div>
								<div class="col-lg-5 col-xl-4">

									<div class="mb-4">
										<p class="mb-2">
											<i class="flag-icon flag-icon-us me-1"></i> 美国 <span
												class="float-end">70%</span>
										</p>
										<div class="progress" style="height: 7px;">
											<div class="progress-bar bg-primary progress-bar-striped"
												role="progressbar" style="width: 70%"></div>
										</div>
									</div>

									<div class="mb-4">
										<p class="mb-2">
											<i class="flag-icon flag-icon-ca me-1"></i> 加拿大 <span
												class="float-end">65%</span>
										</p>
										<div class="progress" style="height: 7px;">
											<div class="progress-bar bg-danger progress-bar-striped"
												role="progressbar" style="width: 65%"></div>
										</div>
									</div>

									<div class="mb-4">
										<p class="mb-2">
											<i class="flag-icon flag-icon-gb me-1"></i> 英国 <span
												class="float-end">60%</span>
										</p>
										<div class="progress" style="height: 7px;">
											<div class="progress-bar bg-success progress-bar-striped"
												role="progressbar" style="width: 60%"></div>
										</div>
									</div>

									<div class="mb-4">
										<p class="mb-2">
											<i class="flag-icon flag-icon-au me-1"></i> 澳大利亚 <span
												class="float-end">55%</span>
										</p>
										<div class="progress" style="height: 7px;">
											<div class="progress-bar bg-warning progress-bar-striped"
												role="progressbar" style="width: 55%"></div>
										</div>
									</div>

									<div class="mb-4">
										<p class="mb-2">
											<i class="flag-icon flag-icon-in me-1"></i> 印度 <span
												class="float-end">50%</span>
										</p>
										<div class="progress" style="height: 7px;">
											<div class="progress-bar bg-info progress-bar-striped"
												role="progressbar" style="width: 50%"></div>
										</div>
									</div>

									<div class="mb-0">
										<p class="mb-2">
											<i class="flag-icon flag-icon-cn me-1"></i> 中国 <span
												class="float-end">85%</span>
										</p>
										<div class="progress" style="height: 7px;">
											<div class="progress-bar bg-dark progress-bar-striped"
												role="progressbar" style="width: 85%"></div>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-12 col-lg-5 col-xl-4 d-flex">
					<div class="card w-100 radius-10">
						<div class="card-body">
							<div class="card radius-10 border shadow-none">
								<div class="card-body">
									<div class="d-flex align-items-center">
										<div>
											<p class="mb-0 text-secondary">本周点赞数量</p>
											<h4 class="my-1">45.6M</h4>
											<p class="mb-0 font-13">比起上周增加+6.2%</p>
										</div>
										<div
											class="widgets-icons-2 bg-gradient-cosmic text-white ms-auto">
											<i class='bx bxs-heart-circle'></i>
										</div>
									</div>
								</div>
							</div>
							<div class="card radius-10 border shadow-none">
								<div class="card-body">
									<div class="d-flex align-items-center">
										<div>
											<p class="mb-0 text-secondary">本周新增留言</p>
											<h4 class="my-1">25.6K</h4>
											<p class="mb-0 font-13">比起上周增加+3.7%</p>
										</div>
										<div
											class="widgets-icons-2 bg-gradient-ibiza text-white ms-auto">
											<i class='bx bxs-comment-detail'></i>
										</div>
									</div>
								</div>
							</div>
							<div class="card radius-10 mb-0 border shadow-none">
								<div class="card-body">
									<div class="d-flex align-items-center">
										<div>
											<p class="mb-0 text-secondary">本周总分享数</p>
											<h4 class="my-1">85.4M</h4>
											<p class="mb-0 font-13">比上周增加+4.6%</p>
										</div>
										<div
											class="widgets-icons-2 bg-gradient-moonlit text-white ms-auto">
											<i class='bx bxs-share-alt'></i>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>

				</div>
			</div>
			<!--end row-->

			<div class="row row-cols-1 row-cols-lg-3">
				<div class="col d-flex">
					<div class="card radius-10 w-100">
						<div class="card-body">
							<p class="font-weight-bold mb-1 text-secondary">收支比率</p>
							<div class="d-flex align-items-center mb-4">
								<div>
									<h4 class="mb-0">￥89,540</h4>
								</div>
								<div class="">
									<p
										class="mb-0 align-self-center font-weight-bold text-success ms-2">
										4.4% <i class="bx bxs-up-arrow-alt mr-2"></i>
									</p>
								</div>
							</div>
							<div class="chart-container-0">
								<canvas id="chart3"></canvas>
							</div>
						</div>
					</div>
				</div>
				<div class="col d-flex">
					<div class="card radius-10 w-100">
						<div class="card-header bg-transparent">
							<div class="d-flex align-items-center">
								<div>
									<h6 class="mb-0">备用表</h6>
								</div>
								<div class="dropdown ms-auto">
									<a class="dropdown-toggle dropdown-toggle-nocaret" href="#"
										data-bs-toggle="dropdown"><i
										class='bx bx-dots-horizontal-rounded font-22 text-option'></i>
									</a>
									<ul class="dropdown-menu">
										<li><a class="dropdown-item" href="javascript:;">Action</a>
										</li>
										<li><a class="dropdown-item" href="javascript:;">Another
												action</a></li>
										<li>
											<hr class="dropdown-divider">
										</li>
										<li><a class="dropdown-item" href="javascript:;">Something
												else here</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="card-body">
							<div class="chart-container-1">
								<canvas id="chart4"></canvas>
							</div>
						</div>
						<ul class="list-group list-group-flush">
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">Completed
								<span class="badge bg-gradient-quepal rounded-pill">25</span>
							</li>
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">Pending
								<span class="badge bg-gradient-ibiza rounded-pill">10</span>
							</li>
							<li
								class="list-group-item d-flex bg-transparent justify-content-between align-items-center">Process
								<span class="badge bg-gradient-deepblue rounded-pill">65</span>
							</li>
						</ul>
					</div>
				</div>
				<div class="col d-flex">
					<div class="card radius-10 w-100">
						<div class="card-header bg-transparent">
							<div class="d-flex align-items-center">
								<div>
									<h6 class="mb-0">各仓库出入货品(8号为备用仓库)</h6>
								</div>
								<div class="dropdown ms-auto">
									<a class="dropdown-toggle dropdown-toggle-nocaret" href="#"
										data-bs-toggle="dropdown"><i
										class='bx bx-dots-horizontal-rounded font-22 text-option'></i>
									</a>
									<ul class="dropdown-menu">
										<li><a class="dropdown-item" href="javascript:;">查看收入</a>
										</li>
										<li><a class="dropdown-item" href="javascript:;">查看支出</a></li>
										<li>
											<hr class="dropdown-divider">
										</li>
										<li><a class="dropdown-item" href="javascript:;">总货量</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="card-body">
							<div class="chart-container-0">
								<canvas id="chart5"></canvas>
							</div>
						</div>
						<div class="row row-group border-top g-0">
						<div class="col">
								<div class="p-3 text-center">
									<h4 class="mb-0 text-danger">45,216</h4>
									<p class="mb-0">总发货量</p>
								</div>
							</div>
							<div class="col">
								<div class="p-3 text-center">
									<h4 class="mb-0 text-success">68,154</h4>
									<p class="mb-0">总收货量</p>
								</div>
							</div>
						</div>
						<!--end row-->
					</div>
				</div>
			</div>
			<!--end row-->

		</div>
	</div>
	<!--end page wrapper -->
	<!--start overlay-->
	<div class="overlay toggle-icon"></div>
	<!--end overlay-->
	<!--Start Back To Top Button-->
	<a href="javaScript:;" class="back-to-top"><i
		class='bx bxs-up-arrow-alt'></i></a>
	<!--End Back To Top Button-->
	<footer class="page-footer">
		<p class="mb-0">叫花鸡 © 2021.7.12</p>
	</footer>
	</div>
	<!--end wrapper-->
	<!--start switcher-->
	<div class="switcher-wrapper">
		<div class="switcher-btn">
			<i class='bx bx-cog bx-spin'></i>
		</div>
		<div class="switcher-body">
			<div class="d-flex align-items-center">
				<h5 class="mb-0 text-uppercase">Theme Customizer</h5>
				<button type="button" class="btn-close ms-auto close-switcher"
					aria-label="Close"></button>
			</div>
			<hr />
			<h6 class="mb-0">Theme Styles</h6>
			<hr />
			<div class="d-flex align-items-center justify-content-between">
				<div class="form-check">
					<input class="form-check-input" type="radio"
						name="flexRadioDefault" id="lightmode" checked> <label
						class="form-check-label" for="lightmode">Light</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio"
						name="flexRadioDefault" id="darkmode"> <label
						class="form-check-label" for="darkmode">Dark</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio"
						name="flexRadioDefault" id="semidark"> <label
						class="form-check-label" for="semidark">Semi Dark</label>
				</div>
			</div>
			<hr />
			<div class="form-check">
				<input class="form-check-input" type="radio" id="minimaltheme"
					name="flexRadioDefault"> <label class="form-check-label"
					for="minimaltheme">Minimal Theme</label>
			</div>
			<hr />
			<h6 class="mb-0">Header Colors</h6>
			<hr />
			<div class="header-colors-indigators">
				<div class="row row-cols-auto g-3">
					<div class="col">
						<div class="indigator headercolor1" id="headercolor1"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor2" id="headercolor2"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor3" id="headercolor3"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor4" id="headercolor4"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor5" id="headercolor5"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor6" id="headercolor6"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor7" id="headercolor7"></div>
					</div>
					<div class="col">
						<div class="indigator headercolor8" id="headercolor8"></div>
					</div>
				</div>
			</div>
			<hr />
			<h6 class="mb-0">Sidebar Colors</h6>
			<hr />
			<div class="header-colors-indigators">
				<div class="row row-cols-auto g-3">
					<div class="col">
						<div class="indigator sidebarcolor1" id="sidebarcolor1"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor2" id="sidebarcolor2"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor3" id="sidebarcolor3"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor4" id="sidebarcolor4"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor5" id="sidebarcolor5"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor6" id="sidebarcolor6"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor7" id="sidebarcolor7"></div>
					</div>
					<div class="col">
						<div class="indigator sidebarcolor8" id="sidebarcolor8"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--end switcher-->
	<!-- Bootstrap JS -->
	<script src="assets/js/bootstrap.bundle.min.js"></script>
	<!--plugins-->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/plugins/simplebar/js/simplebar.min.js"></script>
	<script src="assets/plugins/metismenu/js/metisMenu.min.js"></script>
	<script src="assets/plugins/perfect-scrollbar/js/perfect-scrollbar.js"></script>
	<script src="assets/plugins/vectormap/jquery-jvectormap-2.0.2.min.js"></script>
	<script
		src="assets/plugins/vectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script src="assets/plugins/chartjs/js/Chart.min.js"></script>
	<script src="assets/plugins/chartjs/js/Chart.extension.js"></script>
	<script src="assets/js/index.js"></script>
	<!--app JS-->
	<script src="assets/js/app.js"></script>
</body>

</html>