package ocjug.juggernaut

class Information {

    static constraints = {
		title(blank:false)
		content(maxSize:255)
    }
	
	String title
	String content
}
