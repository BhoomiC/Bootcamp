/**
 * Created by chhedab on 7/25/2017.
 */
class EmailService{

    private final SecurityService securityService = new SecurityService();
    private final LocationService locationService = new LocationService();

    void sendEmail(String user, String email, String message){
        if(locationService.checkLocation(locationService.retrieveLocation(email))){
            if(securityService.checkPermission(user)){
                if(exists(email)){
                    System.out.println("Email is sent to "+email+ " with message : "+message);
                }
            }
        }
    }


    String retrieveLocation(String email){
        //20 loc to check with Webservice
        return locationService.retrieveLocation(email);
    }

    boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith("@yahoo.com")) {
            return true;
        }else{
            return false;
        }
    }

    boolean checkPermission(String user){
        //20 loc to check in DB
        return securityService.checkPermission(user);
    }

    boolean checkLocation(String location){
        //20 loc to check in DB
        return locationService.checkLocation(location);
    }

}