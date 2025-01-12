class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y + 1 <= yLimit) y++;
                    break;
                case "down":
                    if (y - 1 >= -yLimit) y--;
                    break;
                case "left":
                    if (x - 1 >= -xLimit) x--;
                    break;
                case "right":
                    if (x + 1 <= xLimit) x++;
                    break;
            }
        }

        return new int[]{x, y};
    }
}
