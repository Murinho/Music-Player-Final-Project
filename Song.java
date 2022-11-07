class Song{
    public String songname;
    public Song nextsong,prevsong;
    public Song(){
        this.nextsong = this.prevsong = null;
    }

    public Song(String songname){
        this.songname = songname;
        this.nextsong = this.prevsong = null;
    }
    public String getSongName(){
        return songname;
    }
}