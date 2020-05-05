package leetcode.month4.day17;

import java.util.List;

/**
 * @ClassName MountainArrayImpl
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 10:06
 * @Version 1.0
 */
public class MountainArrayImpl implements MountainArray {

    public List<Integer> list;

    public MountainArrayImpl(List<Integer> list){
        this.list=list;
    }
    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public int length() {
        return list.size();
    }
}
