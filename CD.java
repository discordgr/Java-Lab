public class CD extends Item{

    String artist;
    int numberOfTracks;

	public CD()
	{
	   	super();
	}

    public CD(String theTitle, String theArtist, int tracks, int time, float price)
	{
        super(theTitle,time,price);
		this.artist = theArtist;
		this.numberOfTracks = tracks;
    }

    public String getArtist(){
        return artist;
    }

 	public void setArtist(String artist){
        this.artist=artist;
    }

    public int getNumberOfTracks(){
        return numberOfTracks;
    }

 	public void setNumberOfTracks( int numberOfTracks){
        this.numberOfTracks=numberOfTracks;
    }


    public void print(){
    	System.out.println("Cd details :");
        System.out.println("Title : " + super.getTitle() + "\nArtist : " + this.artist + "\nTracks : " + this.numberOfTracks + "\nTime : " + super.getplayingTime() + "\nPrice : " + super.getPrice());
    }
}
