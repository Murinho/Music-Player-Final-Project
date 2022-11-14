class List{
    private Song currentsong;
    private Song head;

    public List(){
        currentsong = head = null;
    }
    public void addSong(String songname){
        Song newsong = new Song(songname);
        if (head != null){
            head.nextsong = newsong;
            newsong.prevsong = head;
        }
        else currentsong = newsong;
        head = newsong;
    }
    public void goNextSong(){
        if (head != null){
            if (currentsong.nextsong != null){
                currentsong = currentsong.nextsong;
            }
        }
    }
    public void goPrevSong(){
        if (head != null){
            if (currentsong.prevsong != null){
                currentsong = currentsong.prevsong;
            }
        }
    }
    public void viewList(){
        if (head != null){
            Song showsong = head;
            while(showsong.prevsong != null) showsong = showsong.prevsong;
            do{
                System.out.print(showsong.getSongName() + "\n");
                showsong = showsong.nextsong;
            }while(showsong != null);
        }
    }
    public String playCurrentSong(){
        if (currentsong != null) {
            System.out.print("Reproduciendo: " + currentsong.getSongName() + "\n");
            return currentsong.getSongName();
        } else {
            System.out.print("La playlist esta vacia\n");
            return null;
        }
    }
}   