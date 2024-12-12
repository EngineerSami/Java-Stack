// script.js

// Change the background color of rows when hovered
document.addEventListener("DOMContentLoaded", () => {
    const rows = document.querySelectorAll("tbody tr");
    rows.forEach(row => {
        row.addEventListener("mouseover", () => {
            row.style.backgroundColor = "#f9f9f9";
        });
        row.addEventListener("mouseout", () => {
            row.style.backgroundColor = "";
        });
    });
});

// Display an alert when a fruit is clicked (demonstration purpose)
function showFruitDetails(fruitName) {
    alert(`You clicked on ${fruitName}!`);
}
