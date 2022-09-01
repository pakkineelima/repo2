<!DOCTYPE html>
<html>
<body>

<form id="frm1" action="/action_page.php">
<button id="btn1" name="subject" type="submit" value="HTML">HTML</button>
</form>


<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
  var x = document.getElementById("btn1").name;
  document.getElementById("demo").innerHTML = x;
}
</script>

</body>
</html>
