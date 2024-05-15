# QR Code Emailer

## Project Description:

The QR Code Emailer project is a Java application that combines QR code generation with automated email functionality. When executed, the program generates a QR code containing information necessary to send an email. Upon scanning the QR code, an email is automatically sent to the specified recipient.

## Key Features:

1. **QR Code Generation**: Utilizes the ZXing library to dynamically generate a QR code containing email information such as recipient email address, subject, and body.

2. **Automated Email Sending**: Sends an email using JavaMail API, configured with SMTP settings, to the recipient specified in the QR code.

3. **Customizable Email Content**: Allows customization of email subject and body, enabling personalized communication with the recipient.

4. **Attachment Support**: Attaches the generated QR code as an image file to the email, ensuring the recipient has easy access to scan it.

## Usage:

1. Compile and execute the Java program.

2. Upon execution, the program generates a QR code containing email information.

3. The recipient scans the QR code using a QR code scanner app on their device.

4. Upon scanning, an email is automatically sent to the specified recipient with the predefined subject, body, and attached QR code image.

## Further Extensions:

This project can be further extended with additional features such as error handling, user input validation, and support for more complex email functionalities.
