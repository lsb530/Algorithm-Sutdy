package util;

public enum ANSI_COLOR {

    RESET(ColorInfo.ANSI_RESET),
    BLACK(ColorInfo.ANSI_BLACK),
    RED(ColorInfo.ANSI_RED),
    GREEN(ColorInfo.ANSI_GREEN),
    YELLOW(ColorInfo.ANSI_YELLOW),
    BLUE(ColorInfo.ANSI_BLUE),
    PURPLE(ColorInfo.ANSI_PURPLE),
    CYAN(ColorInfo.ANSI_CYAN),
    WHITE(ColorInfo.ANSI_WHITE);

    private String value;

    ANSI_COLOR(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}