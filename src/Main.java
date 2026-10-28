//import observer.*;
//import strategy.*;
//import singleton.*;

import adapter.*;
import builder.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////        Observer

//        OnlineMarketplace onlineMarketplace = new OnlineMarketplace();
//
//        Subscriber ahmed = new Customer("Ahmed");
//        Subscriber mahmoud = new Customer("Mahmoud");
//        Subscriber ali = new Customer("Ali");
//        Subscriber anas = new JobFinder("Anas");
//
//        onlineMarketplace.subscribe(EventType.NEW_PRODUCT, ahmed);
//        onlineMarketplace.subscribe(EventType.NEW_OFER, ahmed);
//
//        onlineMarketplace.subscribe(EventType.NEW_OFER, mahmoud);
//
//        onlineMarketplace.subscribe(EventType.NEW_PRODUCT, ali);
//
//        onlineMarketplace.subscribe(EventType.JOB_OPENING, anas);
//
//        onlineMarketplace.addNewJobOpening("SWE");
//
//
//        onlineMarketplace.addNewProduct(new Product("Moblie", 1000.0));
//        onlineMarketplace.addNewOffer(new Offer("New offer with 20% discound for every item"));

////////////////////////////////////////////////////////////////////////////////////////        Strategy

//        Product wallet = new Product("Wallet",200.0,new RegularPricingStrategy());
//        double walletPrice = wallet.calculatePrice();
//        System.out.println(walletPrice);
//
//        Product jacket = new Product("jacket",300.0,new GoldPricingStrategy());
//        double jacketPrice = jacket.calculatePrice();
//        System.out.println(jacketPrice);
//
//        Product shirt = new Product("shirt",250.0, new PremiumPlusPricingStrategy());
//        double shirtPrice = shirt.calculatePrice();
//        System.out.println(shirtPrice);
//
//        Checkout visaCardCheckout = new Checkout(new VisaCardPaymentStrategy());
//        visaCardCheckout.processPayment(walletPrice);
//
//        Checkout paypalCheckout = new Checkout(new PaypalPaymentStrategy());
//        paypalCheckout.processPayment(shirtPrice);
//
//        Checkout bankTransferCheckout = new Checkout(new BankTransferPaymentStrategy());
//        bankTransferCheckout.processPayment(jacketPrice);


////////////////////////////////////////////////////////////////////////////////////////        Singleton

//        Logger logger = Logger.getInstance();
//        logger.setLogLevel(LogLevel.WARN);
//        logger.logError("Error Occurred!");
//        logger.logWarn("Warning Occurred!");
//        logger.logInfo("This should be neglected!");


////////////////////////////////////////////////////////////////////////////////////////        Builder

//        SlackNotification slackNotification = new SlackNotificationBuilder()
//                .setContent("**Your task was due!**")
//                .setMarkdownLanguage(true)
//                .setRecipient("ahmed@examble.com")
//                .setSender("noreply@examble.com")
//                .setTimestamp("2026-10-25")
//                .build();
//        System.out.println(slackNotification.getContent());
//
//        MessengerNotification messengerNotification = new MessengerNotification.MessengerNotificationBuilder()
//                .setTheme("dark")
//                .setContent("Your task is due !")
//                .setAttachments(List.of("image","gif"))
//                .setRecipient("ahmed@examble.com")
//                .setSender("norepty@examble.com")
//                .setTimestamp("2026-10-25")
//                .build();
//        System.out.println(messengerNotification.getContent());
//
//        EmailNotification emailNotification = new EmailNotification.EmailNotificationBuilder()
//                .setContent("Your task is due!")
//                .setRecipient("mahmoud@example.com")
//                .setSender("noreply@example.com")
//                .setTimestamp("2024-01-01 12:00")
//                .build();
//        System.out.println(emailNotification.getContent());


////////////////////////////////////////////////////////////////////////////////////////        Adapter

//        ThirdPartyWeatherService weatherService = new ThirdPartyWeatherService();
//        LegacyWeatherService legacyWeatherService = new LegacyWeatherService(weatherService);
//        WeatherServiceAdaptee weatherServiceAdapter = new WeatherServiceAdaptee(legacyWeatherService);
//        TemperatureDate result = weatherServiceAdapter.getTemperature(111111,11111);
//        System.out.println(result.getTemperatureDate());


////////////////////////////////////////////////////////////////////////////////////////

    }
}