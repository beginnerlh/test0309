/*
 * ���ǳ�һ���� X Ϊ����, �������ÿλ��������ر���ת 180 �Ⱥ������Կ��Եõ�һ����Ч�ģ��Һ� X ��ͬ������Ҫ��ÿλ���ֶ�Ҫ����ת��
���һ������ÿλ���ֱ���ת�Ժ���Ȼ����һ�����֣� �����������Ч�ġ�0, 1, �� 8 ����ת����Ȼ�������Լ���
2 �� 5 ���Ի�����ת�ɶԷ���6 �� 9 ͬ��������Щ����������������ת�Ժ󶼲�������Ч�����֡�
����������һ�������� N, ����� 1 �� N ���ж��ٸ��� X �Ǻ�����

ʾ��:
����: 10
���: 4
����: 
��[1, 10]�����ĸ������� 2, 5, 6, 9��
ע�� 1 �� 10 ���Ǻ���, ��Ϊ��������ת֮�󲻱䡣
*/
package lianxi0309;

public class test0309 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int N = 100;
		int a = S.rotatedDigits(N);
		System.out.println(a);
	}
}

class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++){
            count += Judge(i);
        }
        return count;
    }
    public int Judge(int n){
        int count = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 3 + '0' || s.charAt(i) == 4 + '0' || s.charAt(i) == 7 + '0' ){
                return 0;
            }
            if(s.charAt(i) == 2 + '0' || s.charAt(i) == 5 + '0'
               || s.charAt(i) == 6 + '0' || s.charAt(i) == 9 + '0'){
                count++;
            }
        }
        if(count == 0){
            return 0;
        }
        return 1;
    }
}
