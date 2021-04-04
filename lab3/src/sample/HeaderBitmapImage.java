package sample;

public class HeaderBitmapImage {
    private short type; // тип зображення або сигнатура
    private long size; // розмір файлу
    private short reserveField1; // резервоване поле №1
    private short reserveField2; // резервоване поле №2
    private long offset; // зміщення
    private long sizeOfHeader; // розмір заголовку
    private long width; // ширина
    private long height; // висота
    private short numberOfColorPlanes; // площини
    private short bitsCount; // кількість біт
    private long compression; // тип ущільнення
    private long sizeOfCompImage; // розмір ущільненого зображення
    private long horizontalResolution; // горизонтальна роздільна здатність
    private long verticalResolution; // вертикальна роздільна здатність
    private long numbOfUsedColors; // кількість кольорів палітри
    private long numbOfImportantColors; // кількість важливих кольорів
    private long halfOfWidth; // половина від ширини зображення (не міститься в заголовку)

    public HeaderBitmapImage() {
    }

    // метод для встановлення початкових значень полів класу HeaderBitmapImage
    public void setValues(short type, long size, short resF1, short resF2, long offs,
                          long sHeader, long w, long h, short nColPan, short bCount, long compr, long sComp,
                          long hRes, long vRes, long nUsCol, long nImpCol, long half)
    {
        setType(type);
        setSize(size);
        setReserveField1(resF1);
        setReserveField2(resF2);
        setOffset(offs);
        setSizeOfHeader(sHeader);
        setWidth(w);
        setHeight(h);
        setNumberOfColorPlanes(nColPan);
        setBitsCount(bCount);
        setCompression(compr);
        setSizeOfCompImage(sComp);
        setHorizontalResolution(hRes);
        setVerticalResolution(vRes);
        setNumbOfUsedColors(nUsCol);
        setNumbOfImportantColors(nImpCol);
        setHalfOfWidth(half);
    }

    public void setType(short type) {
        this.type = type;
    }

    public void setHalfOfWidth(long halfOfWidth) {
        this.halfOfWidth = halfOfWidth;
    }

    public void setNumbOfImportantColors(long numbOfImportantColors) {
        this.numbOfImportantColors = numbOfImportantColors;
    }

    public void setNumbOfUsedColors(long numbOfUsedColors) {
        this.numbOfUsedColors = numbOfUsedColors;
    }

    public void setVerticalResolution(long verticalResolution) {
        this.verticalResolution = verticalResolution;
    }

    public void setHorizontalResolution(long horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
    }

    public void setSizeOfCompImage(long sizeOfCompImage) {
        this.sizeOfCompImage = sizeOfCompImage;
    }

    public void setCompression(long compression) {
        this.compression = compression;
    }

    public void setBitsCount(short bitsCount) {
        this.bitsCount = bitsCount;
    }

    public void setNumberOfColorPlanes(short numberOfColorPlanes) {
        this.numberOfColorPlanes = numberOfColorPlanes;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public void setSizeOfHeader(long sHeader) {
        this.sizeOfHeader = sHeader;
    }

    public void setOffset(long offs) {
        offset = offs;
    }

    public void setReserveField2(short resF2) {
        reserveField2 = resF2;
    }

    public void setReserveField1(short resF1) {
        reserveField1 = resF1;
    }

    public void setSize(long size) {
        this.size = size;
    }


    public short getType() {
        return type;
    }

    public long getHalfOfWidth() {
        return halfOfWidth;
    }

    public long getNumbOfImportantColors() {
        return numbOfImportantColors;
    }

    public long getNumbOfUsedColors() {
        return numbOfUsedColors;
    }

    public long getVerticalResolution() {
        return verticalResolution;
    }

    public long getHorizontalResolution() {
        return horizontalResolution;
    }

    public long getSizeOfCompImage() {
        return sizeOfCompImage;
    }

    public long getCompression() {
        return compression;
    }

    public short getBitsCount() {
        return bitsCount;
    }

    public short getNumberOfColorPlanes() {
        return numberOfColorPlanes;
    }

    public long getHeight() {
        return height;
    }

    public long getWidth() {
        return width;
    }

    public long getSizeOfHeader() {
        return sizeOfHeader;
    }

    public long getOffset() {
        return offset;
    }

    public short getReserveField2() {
        return reserveField2;
    }

    public short getReserveField1() {
        return reserveField1;
    }

    public long getSize() {
        return size;
    }
}
