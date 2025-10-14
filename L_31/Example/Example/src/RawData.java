/**
 * Представляет сырые данные, полученные из внешнего источника.
 * Этот класс инкапсулирует содержимое сырых данных и предоставляет доступ к нему.
 */
class RawData {
    /** Содержимое сырых данных. */
    private final String content;

    /**
     * Создает новый объект RawData с указанным содержимым.
     *
     * @param content Содержимое сырых данных.
     */
    public RawData(String content) {
        this.content = content;
    }

    /**
     * Возвращает содержимое сырых данных.
     *
     * @return Содержимое сырых данных в виде строки.
     */
    public String getContent() {
        return content;
    }
}
