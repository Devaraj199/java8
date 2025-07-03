package interview;

import java.io.Serializable;

interface PermissionRequired {
    // no methods or fields
}


// Class implementing the marker interface

public class MarkerInterface implements Serializable,PermissionRequired {
    private String name;
    private int age;

    public MarkerInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        MarkerInterface markerInterface = new MarkerInterface("Fea", 90);
        RegularUser regularUser = new RegularUser("");
        markerInterface.performAdminAction(markerInterface);
        markerInterface.performAdminAction(regularUser);
    }

    public void performAdminAction(Object user) {
        // Step 3: Check if the class implements the marker interface
        if (user instanceof PermissionRequired) {
            System.out.println("Action permitted for user.");
            // Logic for admin action
        } else {
            System.out.println("Action denied. Insufficient permissions.");
        }
    }
}
 class RegularUser {
    private String name;

    public RegularUser(String name) {
        this.name = name;
    }

    // Getter and setter
}
