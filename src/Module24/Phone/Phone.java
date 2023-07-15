package Module24.Phone;

public class Phone {
    private String model;
    private String number;
    private Phone currentCallingPhone;

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        this.currentCallingPhone = null;
    }

    public void startCall(Phone phone) {
        if (this.getCurrentCallingPhone() == null && phone.getCurrentCallingPhone() == null) {
            System.out.println("Calling to number " + phone.getNumber());
            this.setCurrentCallingPhone(phone);
            phone.setCurrentCallingPhone(this);
        } else if (phone.getCurrentCallingPhone() != null) {
            System.out.println("The called number is busy.");
        } else {
            System.out.println("Your phone is busy.");
        }
    }

    public void endCall() {
        this.getCurrentCallingPhone().setCurrentCallingPhone(null);
        this.setCurrentCallingPhone(null);
    }

    public void sendMessage(Phone phone, String message) {
        System.out.printf("Sending message %s to number %s.\n", message, phone.getNumber());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone getCurrentCallingPhone() {
        return currentCallingPhone;
    }

    public void setCurrentCallingPhone(Phone currentCallingPhone) {
        this.currentCallingPhone = currentCallingPhone;
    }
}
