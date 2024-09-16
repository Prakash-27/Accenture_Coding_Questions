public class vacantRooms {
    
    public static int findTotalNumberOfVacantRooms(int[] arr, int countOfReservedRooms, int totalNumberOfRooms) {
       
        totalNumberOfRooms = totalNumberOfRooms - countOfReservedRooms;
       
        return totalNumberOfRooms; 
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int countOfReservedRooms = 8;
        int totalNumberOfRooms = 10;
        System.out.println(findTotalNumberOfVacantRooms(arr, countOfReservedRooms, totalNumberOfRooms));
    }
}
