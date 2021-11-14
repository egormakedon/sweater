function submitName() {
	const name = document.getElementById('nameInputId').value;
	const url = window.location.origin + window.location.pathname;

	if (name) {
		window.location.href = `${url}?name=${name}`;
	} else {
		window.location.href = url;
	}
}
