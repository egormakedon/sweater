<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport"
	      content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Greeting</title>
</head>
<body>
	<div>
		<input id="nameInputId" type="text">
		<button onclick="submitName()">submit</button>
		<p>Hello, ${name}!</p>
	</div>
	<div>
		<p>Go to the <a href="/messages">messages</a> page.</p>
		<p>Go to the <a href="/">main</a> page.</p>
	</div>

	<script type="text/javascript" src="/resources/js/greeting.js"></script>
</body>
</html>
