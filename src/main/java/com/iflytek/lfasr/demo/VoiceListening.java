//package com.iflytek.lfasr.demo;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.iflytek.msp.lfasr.LfasrClient;
//import com.iflytek.msp.lfasr.exception.LfasrException;
//import com.iflytek.msp.lfasr.model.Message;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//public class VoiceListening {
//    private static final String APP_ID = "8979a8d0";
//    private static final String SECRET_KEY = "ae5a2932754b48e47247cb06a0c39b58";
//    private RecognizerListener recognizerListener = new RecognizerListener() {
//        @Override
//        public void onBeginOfSpeech() {
//            DebugLog.Log( "onBeginOfSpeech enter" );
//            ((JLabel) jbtnRecognizer.getComponent(0)).setText("听写中...");
//            jbtnRecognizer.setEnabled(false);
//        }
//        @Override
//        public void onEndOfSpeech() {
//            DebugLog.Log( "onEndOfSpeech enter" );
//        }
//        /**
//         * 获取听写结果. 获取RecognizerResult类型的识别结果，并对结果进行累加，显示到Area里
//         */
//        @Override
//        public void onResult(RecognizerResult results, boolean islast) {
//            DebugLog.Log( "onResult enter" );
//            //如果要解析json结果，请参考本项目示例的 com.iflytek.util.JsonParser类
////			String text = JsonParser.parseIatResult(results.getResultString());
//            String text = results.getResultString();
//            resultArea.append(text);
//            text = resultArea.getText();
//            if( null!=text ){
//                int n = text.length() / TEXT_COUNT + 1;
//                int fontSize = Math.max( 10, DEF_FONT_SIZE - 2*n );
//                DebugLog.Log( "onResult new font size="+fontSize );
//                int style = n>1 ? Font.PLAIN : DEF_FONT_SIZE;
//                Font newFont = new Font( DEF_FONT_NAME, style, fontSize );
//                resultArea.setFont( newFont );
//            }
//            if( islast ){
//                iatSpeechInitUI();
//            }
//        }
//        @Override
//        public void onVolumeChanged(int volume) {
//            DebugLog.Log( "onVolumeChanged enter" );
//            if (volume == 0)
//                volume = 1;
//            else if (volume >= 6)
//                volume = 6;
//            labelWav.setIcon(new ImageIcon("res/mic_0" + volume + ".png"));
//        }
//
//        @Override
//        public void onError(SpeechError error) {
//            DebugLog.Log( "onError enter" );
//            if (null != error){
//                DebugLog.Log("onError Code：" + error.getErrorCode());
//                resultArea.setText( error.getErrorDescription(true) );
//                iatSpeechInitUI();
//            }
//        }
//        @Override
//        public void onEvent(int eventType, int arg1, int agr2, String msg) {
//            DebugLog.Log( "onEvent enter" );
//            //以下代码用于调试，如果出现问题可以将sid提供给讯飞开发者，用于问题定位排查
//			/*if(eventType == SpeechEvent.EVENT_SESSION_ID) {
//				DebugLog.Log("sid=="+msg);
//			}*/
//        }
//    };
//}
