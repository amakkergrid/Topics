class StringOperations {

    // create static nested class EngString
    public static class EngString{
        boolean english;
        String string;
        EngString(boolean english,String string){
            this.english = english;
            this.string = string;
        }
        public boolean isEnglish(){
            return english;
        }
        public String getString(){
            return string;
        }

        public void setEnglish(){
            this.english = english;
        }
        public void setString(){
            this.string = string;
        }
    }

}