<!DOCTYPE html>
<html lang="en">

<head>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--favicon-->
	<link rel="icon" href="logo3.png.png" type="image/png" />
	<!--plugins-->
	<link href="assets/plugins/simplebar/css/simplebar.css" rel="stylesheet" />
	<link href="assets/plugins/perfect-scrollbar/css/perfect-scrollbar.css" rel="stylesheet" />
	<link href="assets/plugins/metismenu/css/metisMenu.min.css" rel="stylesheet" />
	<!-- loader-->
	<link href="assets/css/pace.min.css" rel="stylesheet" />

	<!-- Bootstrap CSS -->
	<link href="assets/css/bootstrap.min.css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
	<link href="assets/css/app.css" rel="stylesheet">
	<link href="assets/css/icons.css" rel="stylesheet">
	<title>Rocker - Bootstrap 5 Admin Dashboard Template</title>
	<script type="text/javascript" src="jquery-1.8.3.js"></script>
	<script type="text/javascript">
		var booleanYanMail=false;
		var booleanYanPhone=false;
		var booleanYanPwd=false;
		var booleanYanCard=false;
/*		var booleanYanName=false;*/

		function fa(){
			if(booleanYanMail||booleanYanPhone||booleanYanPwd||booleanYanCard){
				alert("验证码发送失败,您有部分信息已经被注册");
			}else {
				var mail = document.getElementById("mail").value;
				$.post("getCode", {"mail": mail}, function (data) {
					console.log();
					if (data == "ok") {
						alert("验证码已发送");
					} else {
						alert("验证码发送失败");
					}
				});
			}
		}
		function conPwd(){
			var pwd1 = document.getElementById("pwd1").value;
			var pwd2 = document.getElementById("pwd2").value;
			// var pwd3 = $("#pwd1").val();
			// alert(pwd3);
			$.post("conPwd",{"pwd1":pwd1,"pwd2":pwd2},function(data){
				if(data=="ok"){
					$("#msg").text("");
					booleanYanPwd=false;
				}else{
					$("#msg").text("两次密码不一致");
					booleanYanPwd=true;
				}
			});
		}

		function yanzheng(){
			if(booleanYanMail||booleanYanPhone||booleanYanPwd||booleanYanCard){
				return false;
			}
			return true;
		}


		function conPhone() {
			var phone = $("#phone").val();
			$.post("conPhone",{"phone":phone},function (data){
				if(data!="ok"){
					$("#phoneStr").text("手机号已被注册");
					booleanYanPhone=true;
				}else{
					$("#phoneStr").text("");
					booleanYanPhone=false;
				}
			});
		}
		function conCard() {
			var card = $("#card").val();
			$.post("conCard",{"card":card},function (data){
				if(data!="ok"){
					$("#cardStr").text("身份证已被注册");
					booleanYanCard=true;
				}else{
					$("#cardStr").text("");
					booleanYanCard=false;
				}
			});

		}
		function conMail() {
			var mail = $("#mail").val();
			$.post("conMail", {"mail": mail}, function (data) {
				if (data != "ok") {
					$("#mailStr").text("邮箱已被注册");
					booleanYanMail = true;
				} else {
					$("#mailStr").text("");
					booleanYanMail = false;
				}
			});
		}

			/*function conName() {
				var name = $("#name").val();
				$.post("conName", {"name": name}, function (data) {
					if (data !=  "ok") {
						$("#nameStr").text("您已有账号，请返回登录页登录");
						booleanYanName = true;
					} else {
						$("#nameStr").text("");
						booleanYanName = false;
					}
				});
			}*/


	</script>
</head>

<body class="bg-login" style="background-image: url(background1.png);">
	<!--wrapper-->
	<div class="wrapper">
		<header class="login-header shadow">
			<nav class="navbar navbar-expand-lg navbar-light bg-white rounded fixed-top rounded-0 shadow-sm">
				<div class="container-fluid">
					<a class="navbar-brand" href="#">
						<img src="logo3.png" width="251" alt="" />
					</a>
					<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent1">
						<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
							<li class="nav-item"> <a class="nav-link active" aria-current="page" href="#"><i class='bx bx-home-alt me-1'></i>Home</a>
							</li>
							<li class="nav-item"> <a class="nav-link" href="#"><i class='bx bx-user me-1'></i>About</a>
							</li>
							<li class="nav-item"> <a class="nav-link" href="#"><i class='bx bx-category-alt me-1'></i>Features</a>
							</li>
							<li class="nav-item"> <a class="nav-link" href="#"><i class='bx bx-microphone me-1'></i>Contact</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
		<div class="d-flex align-items-center justify-content-center my-5">
			<div class="container">
				<div class="row row-cols-1 row-cols-lg-2 row-cols-xl-2">
					<div class="col mx-auto">
						<div class="card mt-5">
							<div class="card-body">
								<div class="border p-4 rounded">
									<div class="text-center">
										<h3 class="">注&nbsp;&nbsp;册</h3>
										<p>已经有账号可以 <a href="/">点这里，返回登录界面</a>
										</p>
									</div>
									<div class="login-separater text-center mb-4"> <span>请注册您的账号</span>
										<hr/>
									</div>
									<div class="form-body">
										<form class="row g-3" action="signDo" method="post" onsubmit="return yanzheng()">
											<div class="col-sm-6">
												<label for="inputFirstName" class="form-label" >用户姓名</label>
												<input  class="form-control"  onblur="conName()" id="name" name="name" autofocus required><b id="nameStr"></b>
											</div>
											<div class="col-sm-6">
												<label for="inputLastName" class="form-label">手机号</label>
												<input  class="form-control" onblur="conPhone()" id="phone"  name="phone" autofocus required><b id="phoneStr"></b>
											</div>
											<div class="col-12">
												<label for="inputEmailAddress" class="form-label">身份证</label>
												<input type="text" class="form-control" onblur="conCard()" id="card" placeholder="请输入真实有效的身份证" name="card" autofocus required><b id="cardStr"></b>
											</div>
											<div class="col-12">
												<label for="inputChoosePassword" class="form-label">密码</label>
												<div class="input-group" id="show_hide_password">
													<input type="password" class="form-control border-end-0" name="pwd1" id="pwd1" placeholder="找个好记的密码别忘了" autofocus required> <a href="javascript:;" class="input-group-text bg-transparent"><i class='bx bx-hide'></i></a>
												</div>
											</div>
											<div class="col-12">
												<label for="inputChoosePassword" class="form-label">确认密码</label>
												<div class="input-group" id="show_hide_password">
													<input type="password" class="form-control border-end-0" name="pwd2" id="pwd2" onblur="conPwd()" placeholder="请输入相同的密码" autofocus required> <a href="javascript:;" class="input-group-text bg-transparent"><i class='bx bx-hide'></i></a>
													<b id="msg" style="color:red"></b>
												</div>
											</div>
											<div class="col-12">
												<label for="inputChoosePassword" class="form-label">邮箱</label>
												<div class="input-group" id="show_hide_password">
													<input  type="email" class="form-control border-end-0"  name="mail" id="mail" onblur="conMail()" required ><b id="mailStr"></b>
												</div>
											</div>
												<label for="inputChoosePassword" class="form-label">验证码</label>
												<div class="input-group" id="show_hide_password">
													<input type="password" class="form-control border-end-0" id="inputChoosePassword" name="code" placeholder="请输入收到的验证码" autofocus required> <a href="javascript:;" class="input-group-text bg-transparent"><i class='bx bx-hide'></i></a>
												</div>
								
											<div class="col-12">
												<div class="form-check form-switch">
													<#--<input class="form-check-input" type="checkbox" id="flexSwitchCheckChecked">-->
												<#--	<label class="form-check-label" for="flexSwitchCheckChecked">我已阅读并理解用户需知</label>-->
													<button class="btn btn-primary" onclick="fa()">发送验证码</button>
												</div>
											</div>
											<div class="col-12">
												<div class="d-grid">
													<button type="submit" class="btn btn-primary"><i class='bx bx-user'></i>提&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交</button>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--end row-->
			</div>
		</div>
		<footer class="bg-white shadow-sm border-top p-2 text-center fixed-bottom">
			<p class="mb-0">Copyright Â© 2021. All right reserved.</p>
		</footer>
	</div>
	<!--end wrapper-->
	<!-- Bootstrap JS -->

	<!--Password show & hide js -->


	<!--app JS-->

</body>

</html>