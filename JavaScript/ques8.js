document
    .getElementById("registerBtn")
    .onclick = function () {
    alert("Registered Successfully");
};
document
    .getElementById("category")
    .onchange = function () {

    console.log(this.value);
};
document
    .getElementById("search")
    .addEventListener(
        "keydown",
        function () {
            console.log(
                "Searching..."
            );
        }
    );
