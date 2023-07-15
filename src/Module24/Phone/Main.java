package Module24.Phone;

public class Main {
    public static void main(String[] args) {

        Phone samsungPhone = new Phone("Galaxy", "916-916-9191");
        Phone xiaomiPhone = new Phone("Mi", "904-904-9494");
        Phone applePhone = new Phone("iPhone", "927-927-9292");

        xiaomiPhone.startCall(samsungPhone);
        xiaomiPhone.endCall();
        applePhone.startCall(samsungPhone);
        xiaomiPhone.startCall(applePhone);

    }
}
