public class HRService {
    public HRService() {
    }

    public static void changeDesignation(Employee employee, String desig){
       employee.setDesig(desig);
   }

    public void changeProject(Employee e, String project) {
        e.setProject(project);
    }

    boolean eligibleForPromotion(Employee e, boolean decision) {
        if (decision) {
            e.setDesig("Promoted");
        } return false;
    }
}