public class CreditCheck {

    public static void main(String[] args) {

        // 初年次ゼミナール、外国語、人文、社会、自然、人間形成、現代社会、共通要求以外（0と入力でOK）
        // A群、B群、C群、関連、自由選択 の順番で数字を入力してください。
        Student student = new Student(2, 10, 6, 6, 6, 2, 2, 0, 18, 40, 28, 4, 0);

        int fysRequest = 2;
        int languageRequest = 8;
        int humanityRequest = 4;
        int societyRequest = 4;
        int scienceRequest = 4;
        int personalRequest = 2;
        int commonThemeRequest = 2;
        int extraRequest = 6;
        // 共通教養は32単位以上

        int majoraRequest = 16;
        int majorbRequest = 36;
        int majorcRequest = 34;
        // 専攻科目は86単位以上
        int freeChoiceRequest = 10;
        // 自由選択科目は10単位以上
        // 全部で128単位以上

        if (student.fys != 2) {
            System.out.println("初年次ゼミナールは必修です。または、入力ミスがないようもう一度確認してください");
        }
        if (student.language >= languageRequest) {
            student.freeChoice += student.language - languageRequest;

        } else {
            System.out.println("外国語科目はあと" + (languageRequest - student.language) + "単位を履修しなければなりません。");

        }
        if (student.humanity >= humanityRequest) {
            student.extra += student.humanity - humanityRequest;
        } else {
            System.out.println("人文の分野はあと" + (humanityRequest - student.humanity) + "単位を履修しなければなりません。");
        }
        if (student.society >= societyRequest) {
            student.extra += student.society - societyRequest;
        } else {
            System.out.println("社会の分野はあと" + (societyRequest - student.society) + "単位を履修しなければなりません。");
        }
        if (student.science >= humanityRequest) {
            student.extra += student.science - scienceRequest;
        } else {
            System.out.println("自然の分野はあと" + (scienceRequest - student.science) + "単位を履修しなければなりません。");
        }
        if (student.personal >= personalRequest) {
            student.extra += student.personal - personalRequest;
        } else {
            System.out.println("人間形成の分野はあと" + (personalRequest - student.personal) + "単位を履修しなければなりません。");
        }
        if (student.commonTheme >= commonThemeRequest) {
            student.extra += student.commonTheme - commonThemeRequest;
        } else {
            System.out.println("現代社会と市民の分野はあと" + (commonThemeRequest - student.commonTheme) + "単位を履修しなければなりません。");
        }
        if (student.extra >= extraRequest) {
            student.freeChoice += student.extra - extraRequest;
        } else {
            System.out.println("共通教養科目総合６単位、はあと" + (extraRequest - student.extra) + "単位を履修しなければなりません。");
        }
        if (student.majorA >= majoraRequest) {
            student.majorB += student.majorA - majoraRequest;
        } else {
            System.out.println("Aの分野はあと" + (majoraRequest - student.majorA) + "単位を履修しなければなりません。");
        }
        if (student.majorB >= majorbRequest) {
            student.majorC += student.majorB - majorbRequest;
        } else {
            System.out.println("Bの分野はあと" + (majorbRequest - student.majorB) + "単位を履修しなければなりません。");
        }
        if (student.related > 8 || student.related < 0) {
            System.out.println("関連科目履修可能単位の上限は8単位までです。");
        }
        if (student.majorC + student.related >= majorcRequest) {
            student.freeChoice += (student.majorC + student.related) - majorcRequest;
        } else {
            System.out.println(
                    "Cと関連科目の分野はあと" + (majorcRequest - (student.majorC + student.related)) + "単位を履修しなければなりません。");
        }
        // ここは自由選択科目
        if (student.freeChoice < freeChoiceRequest) {
            System.out.println("自由選択科目の分野はあと" + (freeChoiceRequest - student.freeChoice) + "単位を履修しなければなりません。");
        }
        // ここは最後フル単の判定式
        if (student.fys == fysRequest && student.language >= languageRequest && student.humanity >= humanityRequest
                && student.society >= societyRequest
                && student.science >= scienceRequest && student.personal >= personalRequest
                && student.commonTheme >= commonThemeRequest &&
                student.extra >= extraRequest && student.majorA >= majoraRequest && student.majorB >= majorbRequest
                && student.majorC + student.related >= majorcRequest
                && student.freeChoice >= freeChoiceRequest) {
            System.out.println("全ての単位を取りました！卒業おめでとうございます！！！");
        }

    }

}
