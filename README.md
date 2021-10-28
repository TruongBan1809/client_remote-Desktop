# client_remote-Desktop
ỨNG DỤNG ANDROID ĐIỀU KHIỂN MÁY TÍNH TỪ XA

I. Mô tả:(ứng dụng phía client(smartphone android))
  Ứng dụng điểu khiển máy tính từ xa thông qua giao thức UDP bằng cách chiếm quyền điều khiển các thiết bị ngoại vị bao gồm chuột và bàn phím.
  Các bạn cần cài đặt file server_remote-client vào máy tính theo đường link:...
  Sau đó cài đặt bằng cách tải xuống smartphone file apk:... hoặc tải xuống ứng dụng qua CHPlay:...
  
II. Mô tả các lớp:
  1. Activity_Main: 
    Chứa giao diện khởi động ứng dụng(trước khi kết nối) gồm các thiết lập ban đầu: ip máy tính, port kết nối,...
  2. AppDelegate:
    Bao gồm xử lý các luồng kết nối giữa client-server, server-client
    Kiểm tra các kết nối netwwork, kết nối máy chủ
  3. ClientThread:
    Chứa giao thức kết nối UDP 
  4. ClientListener:
    
    
 NHÓM TÁC GIẢ: TRUONGBAN1809, GIANG, KHAITRAN
