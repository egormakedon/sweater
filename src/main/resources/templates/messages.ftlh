<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport"
		  content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Messages</title>
</head>
<body>
	<div>
		<div>Add message</div>
		<div>
			<form action="/message" method="post" id="addMessageForm">
				<input type="text" id="messageTextInputId" name="text" placeholder="Input message text.">
				<input type="text" id="messageTagInputId" name="tag" placeholder="Input message tag.">
			</form>
			<button type="submit" form="addMessageForm" value="Submit">Submit</button>
		</div>
	</div>
	<div>
		<div>Messages:</div>
		<div>
			<#list messages as message>
				<div>
					<b>${message.id}</b>
					<span>${message.text}</span>
					<i>${message.tag}</i>
				</div>
			</#list>
		</div>
	</div>
	<div>
		<p>Go to the <a href="/greeting">greeting</a> page.</p>
	</div>
</body>
</html>
