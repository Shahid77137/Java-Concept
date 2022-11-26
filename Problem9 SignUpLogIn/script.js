const loginForm = document.getElementById("login-form");
const signupForm = document.getElementById("signup-form");
const loginToggle = document.getElementById("login-toggle");
const signupToggle = document.getElementById("signup-toggle");
const loginMessage = document.getElementById("login-message");
const signupMessage = document.getElementById("signup-message");

function toggleForm(formToShow, formToHide) {
    formToShow.style.display = "block";
    formToHide.style.display = "none";
}

function login() {
    const username = document.getElementById("login-username").value;
    const password = document.getElementById("login-password").value;

    const users = JSON.parse(localStorage.getItem("users")) || [];
    const user = users.find((u) => u.username === username && u.password === password);

    if (user) {
        loginMessage.textContent = "Login successful!";
        
    } else {
        loginMessage.textContent = "Login Failed!";
    }
}

function signup() {
    const username = document.getElementById("signup-username").value;
    const password = document.getElementById("signup-password").value;

    const users = JSON.parse(localStorage.getItem("users")) || [];

    if (users.some((u) => u.username === username)) {
        signupMessage.textContent = "Username already exists.";
    } else {
        
        users.push({ username, password });

        localStorage.setItem("users", JSON.stringify(users));

        signupMessage.textContent = "Sign Up successful!";
    }
}

loginToggle.addEventListener("click", () => toggleForm(loginForm, signupForm));
signupToggle.addEventListener("click", () => toggleForm(signupForm, loginForm));
