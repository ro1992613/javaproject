<html>
<script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
	function test() {
		$.post("test", {
			name : "Donald Duck",
			city : "Duckburg"
		}, function(data, status) {
			alert("Data: " + data + "\nStatus: " + status);
		});
	}
</script>
<body>
<h2>Hello World!</h2>

</body>
<button value="click" onclick="test()">click</button>
</html>
