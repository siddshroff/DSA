package Searching.LeetCode.Easy;

public class LeetCode278 {
    public static void main(String[] args) {
        int totalVersions = 5;
        LeetCode278 objLeetCode278 = new LeetCode278();
        System.out.println(objLeetCode278.firstBadVersion(totalVersions));
        System.out.println(objLeetCode278.firstBadVersion2(totalVersions));
    }

    private int firstBadVersion2(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid) == true)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    private int firstBadVersion(int totalVersions) {
        int start = 1;
        int mid = 0;
        if (isBadVersion(start)) return start;
        while (start <= totalVersions) {
            mid = start + (totalVersions - start) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                break;
            }
            if (isBadVersion(mid)) {
                totalVersions = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }

    public boolean isBadVersion(int version) {
        int bad = 4;
        if (version < bad) return false;
        return true;
    }
}
