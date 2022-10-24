public class Pairs <T, S>{
        //here to implement generics here, we use a type parameter call T.
        //replace all occurences of String in the class with T
        private final T first;
        private final S second;

        public Pairs(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first='" + first + '\'' +
                    ", second='" + second + '\'' +
                    '}';
        }

    }
