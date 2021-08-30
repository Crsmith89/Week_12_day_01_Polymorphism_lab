public abstract class Cards {
        private String cardNumber;
        private String expiryDate;
        private int securityNumber;

        Cards(String cardNumber, String expiryDate, int securityNumber){
            this.cardNumber =cardNumber;
            this.expiryDate =expiryDate;
            this.securityNumber =securityNumber;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public String getExpiryDate() {
            return this.expiryDate;
        }

        public int getSecurityNumber() {
            return this.securityNumber;
        }
    }

