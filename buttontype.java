<!DOCTYPE html>
<html>
<body>

<button id="btn1" type="button">HTML</button>

<p>Click the "Try it" button to return the type of the "HTML" button:</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
  var x = document.getElementById("btn1").type;
  document.getElementById("demo").innerHTML = x;
}
</script>

</body>
</html>
