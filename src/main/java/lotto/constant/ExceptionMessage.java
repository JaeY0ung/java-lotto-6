package lotto.constant;

public enum ExceptionMessage {
    
    REQUIRE_INTEGER("구입 금액은 9,223,372,036,854,775,807 이하의 정수여야 합니다."),
    REQUIRE_POSITIVE_INTEGER("구입 금액은 양의 정수여야 합니다."),
    REQUIRE_MULTIPLE_OF_LOTTO_PRICE(java.lang.String.format("구입 금액은 %s으로 나누어 떨어져야 합니다.", Number.LOTTO_PRICE)),
    REQUIRE_NONEMPTY_INPUT("값을 입력해주세요."),
    REQUIRE_FIVE_COMMAS(java.lang.String.format("\",\" 개수는 %s개여야 합니다.", Number.LOTTO_NUM_COUNT.getNumber() - 1)),
    REQUIRE_NOT_CONTINUOUSLY_COMMA("\",\"가 연속되지 않게 입력해야 합니다."),
    REQUIRE_SIX_NUMBERS(java.lang.String.format("숫자 개수는 %s개여야 합니다.", Number.LOTTO_NUM_COUNT)),
    REQUIRE_RIGHT_RANGE_NUMBER("1~45 사이의 값을 입력해야 합니다."),
    REQUIRE_UNIQUE_NUMBER("중복되지 않은 값을 입력해야 합니다."),
    REQUIRE_DIFFERENT_NUMBER_WITH_WINNING_NUMBERS("당첨번호와 중복되지 않은 값을 입력해주세요.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        String error = "[ERROR] ";
        return error + message;
    }
}
