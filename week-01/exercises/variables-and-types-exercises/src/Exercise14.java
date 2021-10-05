public class Exercise14 {
    public static void main(String[] args) {
        int gradeLevel = 12;
        boolean senior = gradeLevel == 12;
        boolean isInterestedInVolunteering = true;
        boolean shouldSendVolunteerInfo = senior && isInterestedInVolunteering;

        System.out.println(shouldSendVolunteerInfo);

    }
}
