document.getElementById("contactForm").addEventListener("submit", function(event) {
    event.preventDefault();

    // Get form data
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const message = document.getElementById("message").value;

    // Simple validation
    if (!name || !email || !message) {
        alert("Please fill in all fields.");
    } else {
        alert("Thank you for your message, " + name + "!");
        // Here you would typically send the data to a server, for now we just clear the form
        document.getElementById("contactForm").reset();
    }
});
