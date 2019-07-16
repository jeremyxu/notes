/**
 * @author LiuNaiJie
 * on 2019-05-21
 */

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * <p>
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * <p>
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * 示例 2:
 * <p>
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 * 然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 说明:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */
public class T832 {

	/**
	 * 二维数组循环先获取一维数组
	 * 对一维数组进行逆序
	 * 再进行取反
	 *
	 * @param A
	 * @return
	 */
	public int[][] flipAndInvertImage(int[][] A) {
		for (int[] temp : A) {
			int count = temp.length;
			for (int j = 0; j < count / 2; j++) {
				int x = temp[j];
				temp[j] = temp[count - 1 - j];
				temp[count - 1 - j] = x;
			}
			for (int i = 0; i < count; i++) {
				temp[i] = 1 - temp[i];
			}
		}
		return A;
	}

}