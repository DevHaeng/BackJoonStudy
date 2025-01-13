class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int coefficient = 0;
        int constant = 0;

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    coefficient += 1; 
                } else {
                    coefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();
        if (coefficient != 0) {
            result.append(coefficient == 1 ? "x" : coefficient + "x");
        }
        if (constant != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        return result.toString();
    }
}
