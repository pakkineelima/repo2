<!DOCTYPE html>
<html>
<body>

<form id="frm1" action="/action_page.php">
<button id="btn1" name="subject" type="submit" value="fav_HTML">HTML</button>
<button id="btn2" name="subject" type="submit" value="fav_CSS">CSS</button>
</form>

<p>Click the "Try it" button to return the text on the "HTML" button:</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
  var x = document.getElementById("btn1").innerHTML;
  document.getElementById("demo").innerHTML = x;
}
</script>

</body>
</html>
