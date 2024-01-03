public class PromotionalClient {
    private String promotionName;
    private int clientId;
    private static int participantsCount;

    public PromotionalClient(String promotionName, int clientId) {
        this.promotionName = promotionName;
        this.clientId = clientId;
        participantsCount++;
    }

    // Геттеры и сеттеры

    public static int getParticipantsCount() {
        return participantsCount;
    }

    // Другие методы и логика класса
    public interface IReturnOrder {
        boolean returnItem(Item item);
        // Другие методы, например, причина возврата, дата возврата и т.д.
    }

    public interface IReturnOrder {
        boolean returnItem(Item item);
        // Другие методы, например, причина возврата, дата возврата и т.д.
    }

}
