import java.util.*;

class Q9 {
    public static void printMenu() {
        System.out.println("\n1.Add video\n2.Check availability\n3.Rent a video\n4.Return\n5.List the inventory\n6.Exit");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        VideoStoreLauncher myStore = new VideoStoreLauncher();
        printMenu();
        while(true) {
            System.out.println("\nChoice:");
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice) {
                case 1: {
                    System.out.println("N:");
                    int N = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Titles:");
                    for(int i=0;i<N;++i) {
                        String title = scan.nextLine();
                        myStore.addVideo(title);    
                    }
                    break;
                }
                case 2: {
                    System.out.println("Title:");
                    String title = scan.nextLine();
                    System.out.println(myStore.checkAvailability(title));
                    break;
                }
                case 3: {
                    System.out.println("Title:");
                    String title = scan.nextLine();
                    myStore.rentVideo(title);
                    break;
                }
                case 4: {
                    System.out.println("Title:");
                    String title = scan.nextLine();
                    myStore.returnVideo(title);
                    break;
                }
                case 5: {
                    myStore.listInventory();
                    break;
                }
                case 6: {
                    scan.close();
                    return ;
                }
            }
        }
    }
}

class VideoStoreLauncher {
    private ArrayList<Video> videos = new ArrayList<Video>();

    public void addVideo(String title) {
        videos.add(new Video(title,"Available"));
    }

    public void rentVideo(String title) {
        for(Video video : videos) {
            if (title.toUpperCase().equals(video.title.toUpperCase())) {
                if(video.status.toUpperCase().equals("AVAILABLE")) {
                    video.status = "NotAvailable";
                } else {
                    System.out.println("Video not available");
                }
            }
        }
    }

    public String checkAvailability(String title) {
        for(Video video : videos) {
            if (title.toUpperCase().equals(video.title.toUpperCase())) {
                return video.status;
            }
        }
        return "NotAvailable";
    }

    public void returnVideo(String title) {
        for(Video video: videos) {
            video.status = "Available";
        }
    }

    public void listInventory() {
        for(Video video: videos) {
            if(video.status.toUpperCase().equals("AVAILABLE")) {
                System.out.print(" \""+video.title+"\",");
            }
        }
        System.out.println("");
    }

}

class Video {
    public String title;
    public String status;

    public Video(String title, String status) {
        this.title = title;
        this.status = status;
    }
}