package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

//    public boolean characterUpperCase(String newPassword){
//        for(int i = 0; i<newPassword.length(); i++){
//            if(newPassword.charAt(i) >= 'A' && newPassword.charAt(i) <= 'Z'){
//                return true;
//            }
//        }
//        return  false;
//    }
//
//    public boolean characterLowerCase(String newPassword){
//        for(int i = 0; i<newPassword.length(); i++){
//            if(newPassword.charAt(i) >= 'a' && newPassword.charAt(i) <= 'z'){
//                return true;
//            }
//        }
//        return  false;
//    }
//
//    public boolean atLeastOneDigit(String newPassword){
//        for(int i = 0; i<newPassword.length(); i++){
//            if(newPassword.charAt(i) >= 1 && newPassword.charAt(i) <= 9){
//                return true;
//            }
//        }
//        return  false;
//    }
//
//    public boolean anyCharacterApartFromAlphabetsAndDigits(String newPassword){
//        for(int i = 0; i<newPassword.length(); i++){
//            if((newPassword.charAt(i) != 1 && newPassword.charAt(i) != 9) &&
//                    (newPassword.charAt(i) != 'A' && newPassword.charAt(i) != 'Z') &&
//                    (newPassword.charAt(i) != 'a' && newPassword.charAt(i) != 'z') ) {
//                return true;
//            }
//        }
//        return  false;
//    }


    private boolean isValidPassword(String newPassword) {
        // Check if the new password meets the criteria
        boolean isContain = newPassword.length() >= 8 &&
                newPassword.matches(".*[A-Z].*") &&
                newPassword.matches(".*[a-z].*") &&
                newPassword.matches(".*\\d.*") &&
                newPassword.matches(".*[^a-zA-Z0-9].*");
        return isContain;
    }


    public void changePassword(String oldPassword, String newPassword){
//        boolean x = characterUpperCase(newPassword);
//        boolean y = characterLowerCase(newPassword);
//        boolean z = atLeastOneDigit(newPassword);
//        boolean t = anyCharacterApartFromAlphabetsAndDigits(newPassword);

        if(oldPassword. equals(password)) {
                if(isValidPassword (newPassword)){


                password = newPassword;
                System.out.println("Password Changed Sucessfully");
            }else {
                System.out.println("New password does not meet the criteria.");
            }

        }else{
        System.out.println("oldPassword does not meet the criteria.");
    }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
