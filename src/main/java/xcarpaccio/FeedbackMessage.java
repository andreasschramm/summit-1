package xcarpaccio;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class FeedbackMessage {
    private final ObjectMapper objectMapper = new ObjectMapper();

    private String type;
    private String message;

    // Required by Jackson
    private FeedbackMessage() {
    }

    public FeedbackMessage(String type, String content) {
        this.type = type;
        this.message = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String json() throws IOException {
        return objectMapper.writeValueAsString(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeedbackMessage other = (FeedbackMessage) o;

        if (type != null ? !type.equals(other.type) : other.type != null) return false;
        return !(other != null ? !other.equals(other.message) : other.message != null);

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type='" + type + '\'' +
                ", content='" + message + '\'' +
                '}';
    }
}
