public class JavaGH {
    public static void main (String[] args) {
        Page F1 = new Page("F1", "5M");
        Page Golf = new Page("Golf", "2.5M");
        Page Modelling = new Page("Modelling", "10M");

        UserAccount RyanG = new UserAccount("RyanG");
        UserAccount AlexB = new UserAccount("AlexB");

        RyanG.followAccount(Golf);
        RyanG.followAccount(F1);

        AlexB.followAccount(Modelling);

        RyanG.outputFollowedAccounts();
        AlexB.outputFollowedAccounts();
    }
}
