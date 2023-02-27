#include <GL/glut.h>
void display() {
    glClear(GL_COLOR_BUFFER_BIT);   // Clear the color buffer
    glBegin(GL_TRIANGLES);          // Begin drawing a triangle
    glVertex2f(-0.5f, -0.5f);       // Vertex 1: Bottom left
    glVertex2f( 0.0f,  0.5f);       // Vertex 2: Top middle
    glVertex2f( 0.5f, -0.5f);       // Vertex 3: Bottom right
    glEnd();                        // End drawing the triangle
    glFlush();                      // Flush the OpenGL buffers
}
int main(int argc, char** argv) {
    glutInit(&argc, argv);                      // Initialize GLUT
    glutInitWindowSize(640, 480);               // Set the window size
    glutCreateWindow("Triangle Example");       // Create the window
    glutDisplayFunc(display);                   // Register the display function
    glutMainLoop();                             // Enter the main loop
    return 0;
}
