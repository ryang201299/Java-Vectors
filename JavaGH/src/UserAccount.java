import java.util.Vector;

public class UserAccount {
    String userName;
    Vector<Page> followedPages = new Vector<>();

    public UserAccount(String newName) {
        userName = newName;
    }

    public void followAccount(Page page) {
        followedPages.add(page);
    }

    public void unfollowAccount(Page page) {
        followedPages.removeElement(page);
    }

    public void outputFollowedAccounts() {
        System.out.print("\n" + userName + " followed accounts: ");
        for (int i = 0; i < followedPages.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(followedPages.get(i).pageName);
        }
    }
}
