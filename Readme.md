# 📘 Akakce.com – User Account Management

## 📌 Project Description

This project focuses on the **user account management module** of Akakce.com. It includes core functionalities such as account creation, login, logout, order tracking, message box access, and account deletion. The goal is to provide a secure and personalized shopping experience for users.

--- 

## 🧩 User Stories and Features

### 1. 👤 Account Management

- **US_101: User Account Creation**
    - Users should be able to register by providing their name, surname, email, password, gender, and date of birth.
    - Upon successful registration, users are redirected to the account verification page.
    - 🔐 Password must be at least 8 characters long and include uppercase letters, lowercase letters, and numbers.

- **US_102: Account Verification Check**
    - After logging in, users should see their full name displayed in the top-right profile section.
    - The displayed name must exactly match the one provided during registration.

- **US_104: Login**
    - Users must be able to log in using valid credentials (verified email and password).

- **US_103: Logout**
    - Logged-in users must be able to log out.
    - Upon logout, users should be redirected to the login page.

### 2. 📦 Orders & Messages

- **US_105: Order List Check**
    - After logging in, users should be able to view their order list.
    - If the list is empty, an appropriate message should be displayed.

- **US_106: Message Box Check**
    - Users should be able to access their message box for special campaigns and notifications.
    - If the message box is empty, a proper message should be shown.

### 3. ❌ Account Deletion

- **US_107: Account Deletion**
    - Logged-in users should be able to delete their own account.
    - The correct password must be entered during the deletion process.
    - Account deletion cannot be performed without logging in.

---

## 💻 Technologies and Tools Used

- **Java** – Programming Language for Test Automation
- **Selenium WebDriver** – Browser Automation
- **Git & GitHub** – Version Control
- **JIRA & Zephyr Scale** – Test Management

---

## ✅ Testing Prerequisites

- A supported browser (Chrome, Firefox, Safari) must be installed and running.
- Internet access is required in the test environment.
- Passwords must meet the following criteria:
    - Minimum 8 characters
    - At least one uppercase letter
    - At least one lowercase letter
    - At least one number
- For login, message checking, and account deletion: a verified account must already exist.

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).