####switchButton简介
    switchButton是根据IOS开关按钮风格做成的基于android 2.2以上的安卓按钮
    可以直接通过传入图片的drawable  id  就可以成功的运用

![github](https://github.com/chenhonggy/switchButton/blob/master/example.jpg "github")

####如何开始
#####手动安装
    1.复制IosSwitchButton目录下的类到工程项目中.
    2.复制values文件夹下面的attrs.xml文件到工程项目中。

####开始编码
#####xml文件
在布局文件里面加上这句<br>
        
        <com.switchbutton.main.IosSwitchButton.Ios_switchButt
            android:id="@+id/center_switch_button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            switchbutton:bmHeight="50dp"
            switchbutton:bmWidth="150dp"
            android:layout_centerInParent="true"
            />      
    加上这句之后别忘记了还要在最顶层的布局上面加上<br>
    xmlns:switchbutton="http://schemas.android.com/apk/res-auto"

#####主程序里面
在主程序的Oncreate方法里面调用imageInit方法<br>

        
        topswitchButton.imageInit(this, R.drawable.switch_btn_bg_green, R.drawable.switch_btn_bg_white, R.drawable.switch_btn_normal, R.drawable.switch_btn_pressed);
        
当然你也可以这样：<br>
        
        private int[] img = new int[]{
            R.drawable.switch_btn_bg_green,
            R.drawable.switch_btn_bg_white,
            R.drawable.switch_btn_normal,
            R.drawable.switch_btn_pressed
    };
        
        bottomswitchButton.imageInit(this,img);
        
####其他
#####你可设置监听以及改变switchButton的状态
        centerswitchButton.setChecked(false);
        centerswitchButton.setEnabled(false);
        centerswitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this,"checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"UnChecked",Toast.LENGTH_SHORT).show();
            }
        });
                
                
####最近更新
        
        版本： 1.0
        更新内容： 仿IOS  switchButton 实现
        

