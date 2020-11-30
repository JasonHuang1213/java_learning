package assignment_53;
import java.util.*;

class Assignment_53 {

	public static void main(String[] args) {
		ArrayList<Room> rooms = new ArrayList<Room>();
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		// Program menu interface
		System.out.println("1. Insert an office");
		System.out.println("2. Insert a classroom");
		System.out.println("3. Insert another room (not office, not classroom)");
		System.out.println("4. Print out all rooms");
		System.out.println("5. Print out offices");
		System.out.println("6. Print out classrooms");
		System.out.println("7. Print out other rooms (not office, not classroom)");
		System.out.println("8. Search a room");
		System.out.println("9. Search a staff member");
		System.out.println("0. Exit program");
		
		System.out.println("Your choice: ");
		choice = input.nextInt();
		while(choice != 0) {

			switch(choice) {
				case 1:
					Office office = new Office();
					office.askInfo();
					rooms.add(office);
					break;
				case 2:
					ClassRoom classroom = new ClassRoom();
					classroom.askInfo();
					rooms.add(classroom);
					break;
				case 3:
					Room room = new Room();
					room.askInfo();
					rooms.add(room);
					break;
				case 4:
					for( Room r : rooms) {
						System.out.println(r.toString());
					}
					break;
				case 5:
					for( Room r : rooms) {
						if (r instanceof Office) {
							System.out.println(((Office)r).toString());		
						}
					}
					break;
				case 6:
					for( Room r : rooms) {
						if (r instanceof ClassRoom) {
							System.out.println(((ClassRoom)r).toString());		
						}
					}
					break;
				case 7:
//					for (Room r : rooms) {
//						try {
//							r = (ClassRoom)r;
//						}
//						catch(Exception e) {
//							try {
//								r = (Office)r;
//							}
//							catch(Exception er) {
//								System.out.println(r.toString());
//							}
//						}
//					}
					for (Room r : rooms) {
						if (r instanceof ClassRoom) {
							continue;
						}
						else if (r instanceof Office) {
							continue;
						}
						else {
							System.out.println(r.toString());
						}
					}
					break;
				case 8:
					input.nextLine();
					System.out.println("Room number: ");
					String r_num = input.nextLine();
					for( Room r : rooms) {
						if (r.getNumber().equals(r_num)) {
							System.out.println(r.toString());
						}
					}
					break;
				case 9:
					boolean bool;
					input.nextLine();
					System.out.println("Staff member name: ");
					String name = "";
					name = input.nextLine();
					for ( Room o : rooms) {
						if (o instanceof Office) {
							bool = ((Office)o).isInThisOffice(name);

							if (bool == true) {
								System.out.println(o.toString());
							}
						}
					}
					break;
			}
			System.out.println("1. Insert an office");
			System.out.println("2. Insert a classroom");
			System.out.println("3. Insert another room (not office, not classroom)");
			System.out.println("4. Print out all rooms");
			System.out.println("5. Print out offices");
			System.out.println("6. Print out classrooms");
			System.out.println("7. Print out other rooms (not office, not classroom)");
			System.out.println("8. Search a room");
			System.out.println("9. Search a staff member");
			System.out.println("0. Exit program");
			System.out.println("Your choice: ");
			choice = input.nextInt();
		}
	}

}
